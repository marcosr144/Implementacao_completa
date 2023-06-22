
package implementação.completa;

import java.util.ArrayList;
import java.util.List;

public class empresa {
    private List<Funcionario> funcionarios;
    
    public empresa(){
        this.funcionarios = new ArrayList<>();
        
    }
   
    
    public void adicionaFuncionario (funcionario f) {
        this.funcionarios.add(f);
    }
    
    public List<Funcionario> listarFuncionario() {
        return this.funcionarios;
    }
    
    
}
