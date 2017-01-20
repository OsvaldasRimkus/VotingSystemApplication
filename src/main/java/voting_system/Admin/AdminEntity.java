package voting_system.Admin;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by osvaldas on 17.1.20.
 */

@Entity
public class AdminEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String personalId;
    private String firstName;
    private String lastName;
    private String role;
    private String password_digest;
}
