package voting_system.county_representative;

import voting_system.admin.AdminEntity;
import voting_system.county.CountyEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * Created by osvaldas on 17.1.20.
 */

@Entity
public class CountyRepresentativeEntity extends AdminEntity {

    @OneToOne(cascade = CascadeType.ALL)
    private CountyEntity county;

    public CountyEntity getCounty() {
        return county;
    }

    public void setCounty(CountyEntity county) {
        this.county = county;
    }
}
