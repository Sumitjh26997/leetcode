class ParkingSystem {
    private int[] spots;

    public ParkingSystem(int big, int medium, int small) {
        this.spots = new int[3];
        this.spots[0] = big;
        this.spots[1] = medium;
        this.spots[2] = small;
    }
    
    public boolean addCar(int carType) {
        boolean flag = false;
        
        switch (carType) {
            case 1:
                flag = this.spots[0] > 0 ? true : false;
                this.spots[0]--;
                break;
            case 2:
                flag = this.spots[1] > 0 ? true : false;
                this.spots[1]--;
                break;
            case 3:
                flag = this.spots[2] > 0 ? true : false;
                this.spots[2]--;
                break;
            default:
                break;
        }

        return flag;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */