package EP;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StorageService implements StorageServiceInterface{

    private String nome, endereco;
    private List<StorageUnit> arrendados;
    private Map<List<Rental>, Client> rentals;
    private Map<Integer, HashMap<String, ClientType>> clients;
    private HashMap<String, ClientType> clients_map;

    public StorageService(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.rentals = new HashMap<>();
        this.clients = new HashMap<>();
    }

    @Override
    public boolean registerClient(int taxId, String name, ClientType type) {
        if(taxId == 0 || name == null || type == null || clients.containsKey(taxId)){
            return false;
        }else{
            clients_map = new HashMap<>();
            clients_map.put(name, type);
            clients.put(taxId, clients_map);
        }
        return true;
    }
    
    @Override
    public Client getClient(int taxId) {
        for(Client client : rentals.values()){
            if(client.getNif() == taxId){
                return client;
            }
        }
        return null;
    }

    @Override
    public void addStorageUnit(StorageUnit storageUnit) {
        arrendados.add(storageUnit);
    }

    @Override
    public void addStorageUnits(Collection<StorageUnit> storageUnits) {
        arrendados.addAll(storageUnits);
    }

    @Override
    public boolean checkAvailability(StorageUnit storageUnit, LocalDate startDate, LocalDate endDate) {
        if(storageUnit == null || startDate == null || endDate == null){
            return false;
        }
        return true;
    }

    @Override
    public List<StorageUnit> findAvailableUnits(UnitType unitType, LocalDate fromDate, int duration,int[] minDimensions) {

    }

    @Override
    public boolean rentStorageUnit(Client client, StorageUnit unit, LocalDate startDate, int duration) {
        Rental rental = new Rental(unit, startDate, startDate);
        List<Rental> rentalList = new ArrayList<>();
        rentalList.add(rental);
        rentals.put(rentalList, client);
    }

    @Override
    public double calculateTotalCost(StorageUnit unit, int duration) {
        return 0;
    }

    @Override
    public List<String> listRentals() {
        return rentals.keySet().stream().map((rental) -> rental.toString()).collect(Collectors.toList());
    }

    @Override
    public List<String> listRentals(UnitType unitType) {
        return rentals.keySet().stream().filter((rental) -> rental.getUnit().getUnitType() == unitType).map((rental) -> rental.toString()).collect(Collectors.toList());
    }    
}
