package com.gamingworld.app.gamingworld.profile.domain.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.gamingworld.app.gamingworld.game.domain.model.entity.Game;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "game_experiences")
@NoArgsConstructor
public class GameExperience {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Game.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "game_id")
    private Game game;

    @Column(nullable = false)
    private Integer experience;

    public GameExperience(Game game, Integer experience) {
        this.game = game;
        this.experience = experience;
    }    
}
