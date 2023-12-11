package ma.xproce.inventoryservice.repositories;

import ma.xproce.inventoryservice.entities.video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<video, Long> {
}
