package com.gamingworld.app.gamingworld.profile.domain.model.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.gamingworld.app.gamingworld.security.domain.model.entity.User;
import com.gamingworld.app.gamingworld.shared.model.AuditModel;

import lombok.*;

@Getter
@Setter
@With
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "profiles")
public class Profile extends AuditModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Long id;

    @OneToOne
    private @Getter @Setter
    User user;

    @OneToMany
    private @Getter @Setter List<GameExperience> gameExperiences;

    @OneToMany
    private @Getter @Setter List<FavoriteGame> favouriteGames;

    @OneToMany
    private @Getter @Setter List<StreamerSponsor> streamerSponsors ;

    @OneToMany
    private @Getter @Setter List<TournamentExperience> tournamentExperiences ;

    public void addGameExperience(GameExperience entity){
        gameExperiences.add(entity);
    }
    public void addFavouriteGames(FavoriteGame entity) { favouriteGames.add(entity); }
    public void addStreamerSponsor(StreamerSponsor entity) { streamerSponsors.add(entity); }
    public void addTournamentExperience(TournamentExperience entity) { tournamentExperiences.add(entity); }
}
