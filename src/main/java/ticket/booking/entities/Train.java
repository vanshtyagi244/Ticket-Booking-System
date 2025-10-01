package ticket.booking.entities;
import java.sql.Time;
import java.util.*;

public class Train {
    private String trainId;
    private String trainNo;
    private List<List<Boolean>> seats;
    private Map<String, String> stationTimes;
    private List<String> stations;

    public Train(String trainId, String trainNo, List<List<Boolean>> seats, Map<String, String> stationTimes, List<String> stations){
        this.trainId = trainId;
        this.trainNo = trainNo;
        this.seats = seats;
        this.stationTimes = stationTimes;
        this.stations = stations;
    }

    public Train() {}

    //getters

    public String getTrainId(){
        return trainId;
    }

    public String getTrainNo(){
        return trainNo;
    }

    public List<List<Boolean>> getSeats(){
        return seats;
    }

    public Map<String, String> getStationTimes() {
        return stationTimes;
    }

    public List<String> getStations() {
        return stations;
    }

    public String getTrainInfo() {
         return String.format("Train Id: %s and Train No: %s", trainId, trainNo);
    }

    //setters

    public void setTrainId(String trainId){
        this.trainId = trainId;
    }

    public void setTrainNo(String trainNo){
        this.trainNo = trainNo;
    }

    public void setSeats(List<List<Boolean>> seats){
        this.seats = seats;
    }

    public void setStationTimes(Map<String, String> stationTimes){
        this.stationTimes = stationTimes;
    }

    public void setStations(List<String> stations){
        this.stations = stations;
    }
}
