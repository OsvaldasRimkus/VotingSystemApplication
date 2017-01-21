package voting_system.district;

import voting_system.candidate.CandidateEntity;
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
    private List<CountyEntity> countiesList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "singleMandateDistrict")
    private List<CandidateEntity> candidatesList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CountyEntity> getCountiesList() {
        return countiesList;
    }

    public void setCountiesList(List<CountyEntity> countiesList) {
        this.countiesList = countiesList;
    }

    public List<CandidateEntity> getCandidatesList() {
        return candidatesList;
    }

    public void setCandidatesList(List<CandidateEntity> candidatesList) {
        this.candidatesList = candidatesList;
    }
}
