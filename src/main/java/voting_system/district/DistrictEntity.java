package voting_system.district;

import voting_system.Candidate.CandidateEntity;
import voting_system.county.CountyEntity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by osvaldas on 17.1.20.
 */

@Entity
public class DistrictEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "district")
    private List<CountyEntity> CountiesList;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "candidates")
    private List<CandidateEntity> CandidatesList;

}
