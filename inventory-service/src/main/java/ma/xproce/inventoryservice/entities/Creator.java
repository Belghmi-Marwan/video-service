package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Creator {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String email;
@OneToMany(mappedBy="creator")
private List<video> video;

    @Entity
    public class creator {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // autres champs et méthodes d'accès

        @OneToMany(mappedBy = "creator", cascade = CascadeType.ALL)
        private List<video> videos = new ArrayList<>();

    }
    @Entity
    public class Video {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        // autres champs et méthodes d'accès

        @ManyToOne
        @JoinColumn(name = "creator_id")
        private Creator creator;
    }

}
