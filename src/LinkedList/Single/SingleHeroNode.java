package LinkedList.Single;

public class SingleHeroNode {
    public int no;
    public String name;
    public String nickname;
    public SingleHeroNode next;

    public SingleHeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
