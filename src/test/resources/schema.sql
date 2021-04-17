DROP TABLE IF EXISTS chess_game;

CREATE TABLE chess_game (
    `chess_game_id` BIGINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `title` VARCHAR(255) NOT NULL,
    `board_status` VARCHAR(255) NOT NULL,
    `current_turn_team_color` VARCHAR(255) NOT NULL,
    `white_player_score` DECIMAL(7,3) NOT NULL,
    `black_player_score` DECIMAL(7,3) NOT NULL,
    PRIMARY KEY (`chess_game_id`)
);