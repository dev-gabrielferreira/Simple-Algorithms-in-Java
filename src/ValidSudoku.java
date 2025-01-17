import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] game = {
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        char[][] game2 = {
                  {'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'5', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        System.out.println("Game 1 ------------");
        System.out.println(validSudoku(game));
        System.out.println("Game 2 ------------");
        System.out.println(validSudoku(game2));
    }

    private static boolean validSudoku(char[][] g) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Set<Character>> boxes = new HashMap<>();


        for(int i = 0; i < 9; i++) {
            rows.put(i, new HashSet<>());
            columns.put(i, new HashSet<>());
            boxes.put(i, new HashSet<>());
        }

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char current = g[i][j];
                if(current == '.') continue;

                int boxIndex = 3 * (i / 3) + (j / 3);

                if(
                        rows.get(i).contains(current) ||
                        columns.get(j).contains(current) ||
                        boxes.get(boxIndex).contains(current)
                ) {
                    return false;
                }

                rows.get(i).add(current);
                columns.get(j).add(current);
                boxes.get(boxIndex).add(current);
            }
        }
        return true;
    }
}
