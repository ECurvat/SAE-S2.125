package metier;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author François
 */
public class Graphe {
	private final List<Sommet> listeSommet = new ArrayList<>();
	private final String nomFichier;

	public Graphe(String nomFichier) throws IOException {
		this.nomFichier = nomFichier;
		ouvrir();
	}

	public List<Sommet> getListeSommet() {
		return listeSommet;
	}
	
	
	private void ouvrir() throws FileNotFoundException, IOException{
		
		BufferedReader scanSommets = new BufferedReader(new FileReader(nomFichier));
        
        String ligneActuelle;
        while ((ligneActuelle = scanSommets.readLine()) != null) {
			//System.out.println(ligneActuelle);
            String sommet = ligneActuelle.split(":")[0];
            String[] sommetSplit = sommet.split(",");
            listeSommet.add(new Sommet(sommetSplit[0], sommetSplit[1]));
        }
        scanSommets.close(); 
      
		BufferedReader scanAretes = new BufferedReader(new FileReader(nomFichier));
   
        while ((ligneActuelle = scanAretes.readLine()) != null) {
            ligneActuelle.replace(";;", "");
            
            String[] séparationSommetArete = ligneActuelle.split(":");
            
           
            String[] infoSommetOrigine = séparationSommetArete[0].split(",");
			String[] listeDestination = séparationSommetArete[1].split(";");
			
			/*
			System.out.println("__________________________________________________________________");
			
            System.out.println("Info sommet origine : " +  Arrays.toString(infoSommetOrigine));
			System.out.println("Liste destination : " + Arrays.toString(listeDestination));
			System.out.println("Nombre de routes voisines : " + listeDestination.length);
			*/
			
			Sommet origine=listeSommet.get(listeSommet.indexOf(new Sommet(infoSommetOrigine[0], infoSommetOrigine[1])));
			//System.out.println(origine);
			
            for(String item:listeDestination) {
				
                String[] séparationRouteDestination = item.split("\\|");
                String[] routeIndividuelle = séparationRouteDestination[0].split(",");
				String[] routeDestination = séparationRouteDestination[1].split(",");
				Sommet destination = listeSommet.get(listeSommet.indexOf(new Sommet(routeDestination[0], routeDestination[1])));
				origine.getSuccesseurs().add(new Arete(routeIndividuelle[0], Integer.parseInt(routeIndividuelle[1]),destination));
            }
        }
	}
	
	public List<Sommet> trouverSommetsParType(String type) {
		List<Sommet> trouvailles = new ArrayList<>();
		try {
			if (type.equalsIgnoreCase("V") || type.equalsIgnoreCase("R") || type.equalsIgnoreCase("L")) {
				for(Sommet item : listeSommet) {
					if(item.getType().equalsIgnoreCase(type)) {
						trouvailles.add(item);
					}
				}
			} else {
				throw new TypeInconnuException();
			}
		} catch (TypeInconnuException e) {
			System.out.println("Erreur de recherche : " + e.getMessage());
		}
		return trouvailles;
	}
	
	public List<Arete> trouverAretesParType(String type) {
		List<Arete> trouvailles = new ArrayList<>();
		try {
			if (type.equalsIgnoreCase("A") || type.equalsIgnoreCase("N") || type.equalsIgnoreCase("D")) {
				for(Sommet item : listeSommet) {
					for(Arete parcours : item.getSuccesseurs()) {
						if(parcours.getType().equalsIgnoreCase(type) && !trouvailles.contains(parcours)) {
							trouvailles.add(parcours);
						}
					}
				}
			} else {
				throw new TypeInconnuException();
			}
		} catch (TypeInconnuException e) {
			System.out.println("Erreur de recherche : " + e.getMessage());
		}
		return trouvailles;
	}
	
	public List<Sommet> trouverSommetsRelies(Arete test) {
		List<Sommet> trouvailles = new ArrayList<>();
		for(Sommet item : listeSommet) {
			for(Arete parcours : item.getSuccesseurs()) {
				if(!trouvailles.contains(item) && parcours.equals(test)) {
					trouvailles.add(item);
					trouvailles.add(parcours.getDestination());
				}
			}
		}
		return trouvailles;
	}
}
