

public class Main {
    public static void main(String args[]) {
        Housing building = new Housing("123 Street");
        Housing floor1 = new Housing("123 Street - First floor");

        int firstFloor = building.addStructure(floor1);

        // Create instances of Room using anonymous inner classes
        Room washroom1m = new Room("1F Mens Washroom") {
            public void enter() {
                System.out.println("You have entered the " + this.getName());
            }
        };

        Room washroom1w = new Room("1F Womens Washroom") {
            public void enter() {
                System.out.println("You have entered the " + this.getName());
            }
        };

        Room common1 = new Room("1F Common Area") {
            public void enter() {
                System.out.println("You have entered the " + this.getName());
            }
        };

        int firstMens = floor1.addStructure(washroom1m);
        int firstWomens = floor1.addStructure(washroom1w);
        int firstCommon = floor1.addStructure(common1);

        building.enter();
        Housing currentFloor = (Housing) building.getStructure(firstFloor);
        currentFloor.enter();
        Room currentRoom = (Room) currentFloor.getStructure(firstMens);
        currentRoom.enter();
        currentRoom = (Room) currentFloor.getStructure(firstCommon);
        currentRoom.enter();
        building.exit();
    }
}