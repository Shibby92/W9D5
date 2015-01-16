import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


public class Phonebook {
public static void main(String[] args) {
	Map<String, LinkedList<Integer>> phonebook= new HashMap<String,LinkedList<Integer>>();
	int input=0;
	do{

		System.out.println("***************************");
		System.out.println("Unesite: ");
		System.out.println("1 - za unos novog korisnika");
		System.out.println("2 - ispis korisnika i njihovih brojeva");
		System.out.println("3 - za unos novog broja postojeceg korisnika");
		System.out.println("4 - za izlaz");
		System.out.println("***************************");
		input=TextIO.getlnInt();
		if(input==1){
			System.out.println("Unesite ime korisnika:");
			String name= TextIO.getlnString();
			System.out.println("Unesite broj telefona:");
			int number=TextIO.getlnInt();
			phonebook.put(name, new LinkedList<Integer>());
			phonebook.get(name).push(number);
		}
		else if(input==2){	
			java.util.Set<String> keys = phonebook.keySet();
			Iterator<String> keyIterator = keys.iterator();
			if(phonebook.isEmpty()){
			System.out.println("Imenik je prazan!");
			}
			while (keyIterator.hasNext()) {
				String key = keyIterator.next();
				Iterator<Integer> valueIterator = phonebook.get(key).iterator();
				System.out.println("Ime: " + key);
				while (valueIterator.hasNext()) {
					System.out.println("Broj: " + valueIterator.next());
				}
				System.out.println();
			}
			
		}
		else if (input==3){
			System.out.println("Unesite ime korisnika koje zelite da dodate broj: ");
			String find=TextIO.getlnString();
			while(!phonebook.containsKey(find)){
				System.out.println("Niste unijeli ispravno ime, unesite ponovo:");
				find=TextIO.getlnString();
			}
			System.out.println("Unesite broj:");
			int number=TextIO.getlnInt();
			phonebook.get(find).add(number);
		}
		
	}while(input!=4);
	
}
}
