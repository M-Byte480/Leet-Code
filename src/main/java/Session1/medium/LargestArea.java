package Session1.medium;

public class LargestArea {
  public static int maxArea(int[] height) {
    int maxArea = 0;
    int p1 = 0;
    int p2 = height.length - 1;
    int minHeight;

    while(p1 < p2){
      minHeight = Math.min(height[p1], height[p2]);

      int area = minHeight * (p2 - p1); // distance * height

      if(area > maxArea){
        maxArea = area;
      }

      // Move the smaller of the two, image what would happen in [1000, 1000, 3 ,  4 , 55, 7, 2, 1]
      if (height[p1] < height[p2]) {
        p1++;
      } else {
        p2--;
      }
    }
    return maxArea;
  }
}
