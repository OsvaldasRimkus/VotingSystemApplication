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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonalId() {
        return personalId;
    }

    public void setPersonalId(String personalId) {
        this.personalId = personalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPositionInPartyList() {
        return positionInPartyList;
    }

    public void setPositionInPartyList(int positionInPartyList) {
        this.positionInPartyList = positionInPartyList;
    }

    public PoliticalPartyEntity getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(PoliticalPartyEntity politicalParty) {
        this.politicalParty = politicalParty;
    }

    public DistrictEntity getSingleElectDistrict() {
        return singleElectDistrict;
    }

    public void setSingleElectDistrict(DistrictEntity singleElectDistrict) {
        this.singleElectDistrict = singleElectDistrict;
    }
}
