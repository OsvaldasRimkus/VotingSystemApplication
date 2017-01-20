package voting_system.Candidate;

import voting_system.district.DistrictEntity;
import voting_system.political_party.PoliticalPartyEntity;

import javax.persistence.*;

/**
 * Created by osvaldas on 17.1.20.
 */

@Entity
public class CandidateEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String personalId;
    private String firstName;
    private String lastName;
    private int positionInPartyList;

    @ManyToOne
    PoliticalPartyEntity politicalParty;

    @ManyToOne
    DistrictEntity singleElectDistrict;
}
