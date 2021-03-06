package MessageVo.messages.mv.order.m.flight;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import com.google.common.base.MoreObjects;

import MessageVo.messages.mv.order.m.flight.m.Terminal; 
import MessageVo.messages.mv.order.m.flight.m.DepartureTime; 
import MessageVo.messages.mv.order.m.flight.m.No; 
import MessageVo.messages.mv.order.m.flight.m.Airport; 
@JsonIgnoreProperties(ignoreUnknown = true)
public class M implements Serializable {
    private static final long serialVersionUID = 1L;
    private Airport airport;
    private DepartureTime departureTime;
    private No no;
    private Terminal terminal;
    
    public Airport getAirport() {
        return airport;
    }
    
    public void setAirport(Airport airport) {
        this.airport = airport;
    }
    
    public DepartureTime getDepartureTime() {
        return departureTime;
    }
    
    public void setDepartureTime(DepartureTime departureTime) {
        this.departureTime = departureTime;
    }
    
    public No getNo() {
        return no;
    }
    
    public void setNo(No no) {
        this.no = no;
    }
    
    public Terminal getTerminal() {
        return terminal;
    }
    
    public void setTerminal(Terminal terminal) {
        this.terminal = terminal;
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("airport", airport)
                .add("departureTime", departureTime)
                .add("no", no)
                .add("terminal", terminal)
                .toString();
    }
    
}
