package nl.avans.drivio.controller;

import nl.avans.drivio.model.User;
import nl.avans.drivio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService UserService;

    @Autowired
    public UserController(UserService UserService) {
        this.UserService = UserService;
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return (List<User>) UserService.getAllUsers();
    }

    @GetMapping("{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") int userId) {
        return new ResponseEntity<>(UserService.getUserById(userId), HttpStatus.OK);
    }
    @PostMapping()
    public void addUser(@RequestBody User user) {
        UserService.addUser(user);
    }

    @PutMapping("{userId}")
    public ResponseEntity<User> updateUser(@PathVariable("userId") int id, @RequestBody User user) {
        return new ResponseEntity<>(UserService.updateUser(user, id), HttpStatus.OK);
    }

    @DeleteMapping("{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable("userId") int userId) {

        // Delete user from Database
        UserService.deleteUser(userId);

        return new ResponseEntity<String>("User deleted successfully!", HttpStatus.OK);
    }
}

