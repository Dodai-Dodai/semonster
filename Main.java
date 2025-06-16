public class Main {
  public static void main(String[] args) {

    System.out.println("SEMONSTER GAME");
    System.out.println("Sow a new monster!");
    // Monster monster = new Monster();
    // System.out.println(monster.toString());

    Player player = new Player();
    player.drawMonsters();
    player.showDeck();
  }
}
