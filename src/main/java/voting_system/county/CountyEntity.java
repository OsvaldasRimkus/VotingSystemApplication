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
    DistrictEntity district;
    @OneToOne(mappedBy = "county")
    CountyRepresentativeEntity CountyRepresentative;
}
