package voting_system.political_party;

import voting_system.candidate.CandidateEntity;

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

    @OneToMany
    private List<CandidateEntity> partyMembersList;

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

    public List<CandidateEntity> getPartyMembersList() {
        return partyMembersList;
    }

    public void setPartyMembersList(List<CandidateEntity> partyMembersList) {
        this.partyMembersList = partyMembersList;
    }
}
