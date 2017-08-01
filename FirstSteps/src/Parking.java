//public class Parking {
//
//    int busyPlaces = 0;
//    static int size = 0;
//    String name;
//
//}
//
//    public Parking(String name, int size) {
//        this.size = size;
//        System.out.println(name);
//    }
//
//    public int getSize() {
//        int size = (int) (Math.random() * 501);
//        System.out.println("Size of parking: " + size);
//        return size;
//    }
//
//    public int addCar() {
//        if (busyPlaces>=size)
//        {
//            System.out.println("There are no more empty spaces");
//        }
//        else {
//            busyPlaces++;
//            System.out.println("The car was added. " + busyPlaces + "/" + size + " place(s) are already busy");
//        }
//        return busyPlaces;
//    }
//    public int removeCar() {
//        if (busyPlaces ==0)
//        {
//            System.out.println("There are no more cars to remove");
//        }
//        else {
//            busyPlaces--;
//            System.out.println("The car was removed. " + busyPlaces + "/" + size + " place(s) are busy");
//        }
//        return busyPlaces;
//    }
//
//    public int getEmptyPlaces() {
//        int emptyPlaces = size - busyPlaces;
//        System.out.println("There is(are) " + emptyPlaces + "/" + size + " empty places left" );
//        return emptyPlaces;
//    }
//
//    public static Parking[] getParkings(int qntOfParks){
//        Parking[] parking = new Parking[qntOfParks];
//        for (int x = 0; x < qntOfParks; x++) {
//            parking[x] = new Parking("Parking" + (x+1), size);
//            parking[x].getSize();
//        }
//        return parking;
//    }
//
//
//
//*//*    public int getBusyPlaces() {
//
//        return size - emptyPlaces;
//    }*//*
//
//*//*    public void setPlaces(int size) {
//
//        this.size = size;
//    }*//*
//
//}*/
