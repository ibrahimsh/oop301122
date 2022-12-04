package ex2;

public class testing {
    public static void main(String[] args) {
        Room r= new Room();
        standartRoom sr = new standartRoom();
        vipRoom vr = new vipRoom();
        vipRoomCelebration vrc = new vipRoomCelebration();
        vipPresedentRoom vrcp = new vipPresedentRoom();
        Room[] list_room = new Room[5];

        guitar n = new guitar("music","tttt",7);
        System.out.println(n.getD());
    }
}
