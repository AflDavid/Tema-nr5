import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class primul {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String keyboard = input.nextLine();
		String fileName = input.nextLine();
		int eqLines = 0;

		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));

			String line = br.readLine();
			while (line != null) {
				if (keyboard.equals(line))
					eqLines++;
				line = br.readLine();
			}

			br.close();

		} catch (IOException e) {
			System.out.println("Error");
		}

		System.out.println(eqLines);
	}

}