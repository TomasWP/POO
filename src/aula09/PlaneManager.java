package aula09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlaneManager {
    private Map<String, Plane> planesMap;
    
    public PlaneManager() {
        planesMap = new HashMap<>();
    }
    
    public void addPlane(Plane plane) {
        planesMap.put(plane.getId(), plane);
    }
    
    public boolean removePlane(String id) {
        planesMap.remove(id);
        return true;
    }
    
    public Plane searchPlane(String id) {
        return planesMap.get(id);
    }
    
    public List<CommercialPlane> getCommercialPlanes() {
        List<CommercialPlane> commercialPlanes = new ArrayList<>();
        for (Plane plane : planesMap.values()) {
            if (plane instanceof CommercialPlane) {
                commercialPlanes.add((CommercialPlane) plane);
            }
        }
        return commercialPlanes;
    }
    
    public List<MilitaryPlane> getMilitaryPlanes() {
        List<MilitaryPlane> militaryPlanes = new ArrayList<>();
        for (Plane plane : planesMap.values()) {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) plane);
            }
        }
        return militaryPlanes;
    }
    
    public void printAllPlanes() {
        if(!planesMap.values().isEmpty()){
            for (Plane plane : planesMap.values()) {
                System.out.println(plane);
            }
        }else{
            System.out.println("No planes in the fleet.");
        }
    }
    
    public Plane getFastestPlane() {
        Plane fastestPlane = null;
        int fastestSpeed = Integer.MIN_VALUE;
        for (Plane plane : planesMap.values()) {
            if (plane.getVelocidadeMax() > fastestSpeed) {
                fastestSpeed = plane.getVelocidadeMax();
                fastestPlane = plane;
            }
        }
        return fastestPlane;
    }
}
