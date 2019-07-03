
package model.exceptions;
// @author diego.almeida
 
public class DomainException extends RuntimeException{
    
    private static final long serialVersionID = 1L;
    
    public DomainException(String msg){
        super(msg);
    }
}
