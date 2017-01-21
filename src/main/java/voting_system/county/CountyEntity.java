package voting_system.county;

import voting_system.county_representative.CountyRepresentativeEntity;
import voting_system.district.DistrictEntity;

import javax.persistence.*;

/**
 * Created by osvaldas on 17.1.20.
 */

@Entity
public class CountyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private int votersCount;

    @ManyToOne
    @JoinColumn(name = "district_id")
    private DistrictEntity district;
    @OneToOne(mappedBy = "county")
    private CountyRepresentativeEntity countyRepresentative;

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

    public int getVotersCount() {
        return votersCount;
    }

    public void setVotersCount(int votersCount) {
        this.votersCount = votersCount;
    }

    public DistrictEntity getDistrict() {
        return district;
    }

    public void setDistrict(DistrictEntity district) {
        this.district = district;
    }

    public CountyRepresentativeEntity getCountyRepresentative() {
        return countyRepresentative;
    }

    public void setCountyRepresentative(CountyRepresentativeEntity countyRepresentative) {
        this.countyRepresentative = countyRepresentative;
    }
}
