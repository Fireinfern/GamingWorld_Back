package com.gamingworld.app.gamingworld.tournament.domain.model.entity;

import javax.persistence.*;

import com.gamingworld.app.gamingworld.tournament.shared.model.AuditModel;
import com.gamingworld.app.gamingworld.user.domain.model.entity.Profile;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@With
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Table(name = "participant")
@Inheritance(strategy = InheritanceType.JOINED)


public class Participant extends AuditModel implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    @NonNull private Integer points;

    @ManyToOne
    @NonNull private Profile participantProfile;

    @ManyToOne(fetch = FetchType.LAZY) private Tournament tournament;

}
