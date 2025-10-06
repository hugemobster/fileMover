import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Objects;

public class Mover  extends JFrame {
        final private File src = new File("/Users/aryandpatel/Documents");
        StringBuilder fails = new StringBuilder("Failed file moves: ");

        public Mover(){
            fileMover();

        /*setTitle("File Mover");
        JOptionPane.showMessageDialog( null, fails.toString(), "File Mover", JOptionPane.PLAIN_MESSAGE);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(475, 300);
        setLayout(null);*/
        }

        //NOTE: check the 29th character onwards
        public void fileMover() {
            StringBuilder fileName = new StringBuilder();

            for (File file : Objects.requireNonNull(src.listFiles())) {

                if (!file.isDirectory()) {

                    fileName.replace(0, fileName.length(), file.toString().substring(29));

                    //File sorting logic below
                    if (!fileName.toString().contains("~$W")){

                        if (fileName.toString().contains("CS")) {
                            System.out.println(fileName);
                            String CS = "/Users/aryandpatel/Documents/CS";
                            System.out.println(CS + fileName);
                            try {
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(CS + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (fileName.toString().contains("Spa")) {
                            try {
                                String spa = "/Users/aryandpatel/Documents/Spanish";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(spa + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (fileName.toString().contains("Math")){
                            try {
                                String math = "/Users/aryandpatel/Documents/Math";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(math + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (fileName.toString().contains("EE")){
                            try {
                                String EE = "/Users/aryandpatel/Documents/EE";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(EE + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (fileName.toString().contains("LangLit")){
                            try {
                                String langLit = "/Users/aryandpatel/Documents/LangLit";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(langLit + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (fileName.toString().contains("Psych")){
                            try {
                                String psych = "/Users/aryandpatel/Documents/Psych";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(psych + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (fileName.toString().contains("Hist")){
                            try {
                                String hist = "/Users/aryandpatel/Documents/History";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(hist + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e) {
                                fails.append(file).append(", ");
                            }
                        }

                        else if (file.toString().contains("Screen Shot")){
                            try{
                                String ss = "/Users/aryandpatel/Documents/ScreenShots";
                                Files.move(Paths.get(String.valueOf(file)),
                                        Paths.get(ss + "/" + fileName),
                                        StandardCopyOption.REPLACE_EXISTING);
                            } catch (IOException e){
                                fails.append(file).append(", ");
                            }
                        }
                    }
                }
            }
        }

        public static void main(String[] args) {
            Mover m = new Mover();
        }

}

