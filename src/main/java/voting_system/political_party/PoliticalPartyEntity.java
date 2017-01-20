package voting_system.political_party;

import voting_system.Candidate.CandidateEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by osvaldas on 17.1.20.
 */

@Entity
public class PoliticalPartyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private List<CandidateEntity> candidateList;
}
