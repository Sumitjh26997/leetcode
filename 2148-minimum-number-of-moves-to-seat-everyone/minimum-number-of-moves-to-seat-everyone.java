class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        int moves = 0;

        Arrays.sort(seats);
        Arrays.sort(students);

        for(int i = 0; i < students.length; i++) {
            moves += (seats[i] > students[i]) ? seats[i] - students[i] : students[i] - seats[i];
        }

        return moves;
    }
}