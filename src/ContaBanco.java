public class ContaBanco {
    private int numConta;
    private String tipo;
    private Pessoa dono;
    private double saldo;
    private boolean status;


    public void abrirConta(){
        setTipo(tipo);
        setStatus(true);
        if("CC".equals(tipo)){
            System.out.println("Conta aberta com sucesso: " + dono.getNome());
            setSaldo(200.00);
        }else if("CP".equals(tipo)){
            setSaldo(300.00);
            System.out.println("Conta aberta com sucesso: " +  dono.getNome());
        }
    }
    public void fecharConta(){
        if(getSaldo() > 0){
            System.out.println("Conta com saldo");
        }else if(getSaldo() < 0){
            System.out.println("Conta com saldo negativo");
        }else{
            setStatus(false);
        }
    }
    public void depositar(double valor){
        if(isStatus() == true){

            if (valor <= 0){
                System.out.println("Valor invalido");
            }else{
                setSaldo(getSaldo() + valor);
                System.out.println("Deposito Realizado");
            }
        }else{
            System.out.println("Conta inativa");
        }
    }
    public double sacar(double valor) {
        if (isStatus() == true) {
            if (valor <= 0) {
                System.out.println("Valor invalido");
            } else if (getSaldo() < valor) {
                System.out.println("Saldo insuficiente");
            } else {
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado");
            }
        } else {
            System.out.println("Conta inativa");
        }
        return valor;
    }

        public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    public ContaBanco() {
        this.numConta = numConta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ContaBanco{" +
                "numConta=" + numConta +
                ", tipo='" + tipo + '\'' +
                ", dono=" + dono +
                ", saldo=" + saldo +
                ", status=" + status +
                '}';
    }
}
