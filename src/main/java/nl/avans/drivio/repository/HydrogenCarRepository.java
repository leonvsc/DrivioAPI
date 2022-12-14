package nl.avans.drivio.repository;

import nl.avans.drivio.model.HydrogenCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HydrogenCarRepository extends JpaRepository<HydrogenCar, Integer> {
}
