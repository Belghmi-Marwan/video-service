package ma.xproce.inventoryservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    @ManyToOne
    private Creator creator ;

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
