package nl.avans.drivio.repository;

import nl.avans.drivio.model.ElectricCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElectricCarRepository extends JpaRepository<ElectricCar, Integer> {
}
