package homework7.myFile;

import homework7.solders.Solder;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyFile {

    public void writeInformationAboutBattle(File file, Solder solder1, Solder solder2) {

        try (OutputStream outputStream = new FileOutputStream(file)) {
            byte[] informationAboutSolder1 = solder1.toString().getBytes();
            byte[] informationAboutSolder2 = solder2.toString().getBytes();

            outputStream.write(informationAboutSolder1);
            outputStream.write(informationAboutSolder2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importInformationAboutBattle(File file, Solder solder1, Solder solder2) {
        try (InputStream inputStream = new FileInputStream(file)) {

            String information = new String(inputStream.readAllBytes());

            String[] informationWhiteLines = information.split("\n");

            List<String[]> informationalHealthSolders = Arrays.stream(informationWhiteLines)
                    .filter(filter -> filter.length() > 2)
                    .map(each -> each.split("-> "))
                    .collect(Collectors.toList());

            List<String> informationAboutHeathSolders = informationalHealthSolders.stream()
                    .map(each -> each[1])
                    .collect(Collectors.toList());

            solder1.setHeath(Integer.parseInt(informationAboutHeathSolders.get(0)));
            solder2.setHeath(Integer.parseInt(informationAboutHeathSolders.get(1)));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
