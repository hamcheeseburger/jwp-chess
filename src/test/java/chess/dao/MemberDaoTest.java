package chess.dao;

import static org.assertj.core.api.Assertions.assertThat;

import chess.domain.game.ChessBoard;
import chess.domain.member.Member;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberDaoTest {

    private final MemberDao<Member> dao = new ChessMemberDao(new ChessConnectionManager());
    private final ChessBoardDao BoardDao = new ChessBoardDao(new ChessConnectionManager());
    private int boardId;

    @BeforeEach
    void setup() {
        final ChessBoard board = BoardDao.save(new ChessBoard("에덴파이팅~!"));
        this.boardId = board.getId();
    }

    @Test
    void save() {
        final Member member = dao.save("eden", boardId);
        assertThat(member.getName()).isEqualTo("eden");
    }

    @AfterEach
    void setDown() {
        BoardDao.deleteAll();
    }
}
