package in.railworld.OneToOne;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "passport_id", referencedColumnName = "id")

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    private Passport passport;

}
