package club.banyuan.homework_12_2.Team;

import java.util.Objects;

/**
 * @author edz
 * @version 1.0
 * @date 2020/12/2 6:23 下午
 */
public class Player {
    private String name;
    private int Id;
    private Role role;

    public Player() {
    }

    public Player(String name, int id, Role role) {
        this.name = name;
        Id = id;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", role=" + role +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return Id == player.Id && Objects.equals(name, player.name) && role == player.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, Id, role);
    }
}
