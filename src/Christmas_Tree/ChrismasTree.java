package Christmas_Tree;

public class ChrismasTree {
    public void createTree(int wide) throws Exception {
        if (wide < 4) {
            throw new Exception("Input must be at least 4.");
        } else {
            int height = 0;
            for (int i = 0; i < wide+2; i++){
                if (height == wide){
                    height = 1;
                }
                for (int j = wide - height; j > 1; j--){
                    System.out.print("  ");
                }
                for (int k = 1; k <= (2 * height - 1); k++){
                    System.out.print("* ");
                }
                System.out.println();
                height++;
            }
        }
    }
}
