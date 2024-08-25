package frota;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author cesar
 */
public interface Frota {
    public static void main(String[] args) {
        String msg = "";
        int esc=0;
        Boolean erro = false;
        int esc2=0;
        ArrayList array = new ArrayList();
        do{
            do{
                erro = false;
                try{
                    esc = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha uma opção: \n"
                    + "1 - Inserir automóvel\n2 - Remover automóvel\n3 - Listar automóveis\n4 - Alterar automóvel\n"
                    + "\n0 - Sair"));
                } catch(Exception erroGeral){
                    JOptionPane.showMessageDialog(null, "Erro!");
                    erro = true;
                }
            }while(erro == true);
            switch(esc){
                case 1:
                    try{
                        esc2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Carro ou Caminhão?\n1 - Carro\n"
                            + "2 - Caminhão"));
                    } catch(Exception erroGeral){
                        JOptionPane.showMessageDialog(null, "Erro!");
                        break;
                    }
                    if(esc2 == 1){
                        Carro carro1 = new Carro();
                        carro1.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
                        carro1.setModelo(JOptionPane.showInputDialog("Digite a modelo: "));
                        do{
                            erro = false;
                            try{
                                carro1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a ano: ")));
                            } catch(Exception erroGeral){
                                JOptionPane.showMessageDialog(null, "Erro!");
                                erro = true;
                                break;
                            }
                        }while(erro == true);
                        try{
                            carro1.setPortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a portas: ")));
                        } catch(Exception erroGeral){
                            JOptionPane.showMessageDialog(null, "Erro!");
                            break;
                        }
                        try{
                            carro1.setLugares(Integer.parseInt(JOptionPane.showInputDialog("Digite a lugares: ")));
                        } catch(Exception erroGeral){
                            JOptionPane.showMessageDialog(null, "Erro!");
                            break;
                        }
                        carro1.setTipo(JOptionPane.showInputDialog("Digite a tipo: "));
                        array.add(carro1);
                    } else if(esc2 == 2){
                        Caminhao caminhao1 = new Caminhao();
                        caminhao1.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
                        caminhao1.setModelo(JOptionPane.showInputDialog("Digite a modelo: "));
                        caminhao1.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a ano: ")));
                        caminhao1.setCapacidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade: ")));
                        caminhao1.setLargura(Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: ")));
                        caminhao1.setCaracteristica(JOptionPane.showInputDialog("Digite a característica: "));
                        array.add(caminhao1);
                    } else{
                        JOptionPane.showMessageDialog(null, "Opção inválida");
                    }
                    break;
                case 2:
                    if(array.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum automóvel inseirdo");
                    } else{
                        esc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do automóvel a ser excluído "));
                        array.remove(esc2);
                    }
                    break;
                case 3:
                    if(array.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum automóvel inseirdo");
                    } else{
                        msg = "";
                        for(int x = 0; x < array.size(); x++){
                            if(array.get(x) instanceof Carro){
                                Carro carro2 = new Carro();
                                carro2 = (Carro) array.get(x);
                                msg = "Marca do carro "+x+": " + carro2.getMarca() + "\n";
                                msg = msg + "Modelo do carro "+x+": " + carro2.getModelo() + "\n";
                                msg = msg + "Ano do carro "+x+": " + carro2.getAno() + "\n";
                                msg = msg + "Portas do carro "+x+": " + carro2.getPortas() + "\n";
                                msg = msg + "lugares no carro "+x+": " + carro2.getLugares() + "\n";
                                msg = msg + "Tipo do carro "+x+": " + carro2.getTipo() + "\n";
                                msg = msg + " ____________________________________________ \n";
                            } else{
                                Caminhao caminhao2 = new Caminhao();
                                caminhao2 = (Caminhao) array.get(x);
                                msg = msg + "Marca do caminhao "+x+": " + caminhao2.getMarca() + "\n";
                                msg = msg + "Modelo do caminhao "+x+": " + caminhao2.getModelo() + "\n";
                                msg = msg + "Ano do caminhao "+x+": " + caminhao2.getAno() + "\n";
                                msg = msg + "Capacidade do caminhao "+x+": " + caminhao2.getCapacidade() + "\n";
                                msg = msg + "Largura caminhao "+x+": " + caminhao2.getLargura() + "\n";
                                msg = msg + "Caracteristica do caminhao "+x+": " + caminhao2.getCaracteristica() + "\n";
                                msg = msg + " ____________________________________________ \n";
                            }
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    }
                    break;
                case 4:
                    if(array.isEmpty()){
                        JOptionPane.showMessageDialog(null, "Nenhum automóvel inseirdo");
                    } else{
                        esc2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do automóvel: "));
                        if(array.size() < esc2 || esc2 < 0){
                            JOptionPane.showMessageDialog(null, "Posição não existente");
                        }
                        if(array.get(esc2) instanceof Carro){
                            Carro carro2 = new Carro();
                            carro2 = (Carro) array.get(esc2);
                            carro2.setMarca(JOptionPane.showInputDialog("Digite a marca: ", carro2.getMarca()));
                            carro2.setModelo(JOptionPane.showInputDialog("Digite a modelo: ", carro2.getModelo()));
                            carro2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a ano: ", carro2.getAno())));
                            carro2.setPortas(Integer.parseInt(JOptionPane.showInputDialog("Digite a portas: ", carro2.getPortas())));
                            carro2.setLugares(Integer.parseInt(JOptionPane.showInputDialog("Digite a lugares: ", carro2.getLugares())));
                            carro2.setTipo(JOptionPane.showInputDialog("Digite a tipo: ", carro2.getTipo()));
                            array.set(esc2, carro2);
                        } else{
                            Caminhao caminhao2 = new Caminhao();
                            caminhao2 = (Caminhao) array.get(esc2);
                            caminhao2.setMarca(JOptionPane.showInputDialog("Digite a marca: ", caminhao2.getMarca()));
                            caminhao2.setModelo(JOptionPane.showInputDialog("Digite a modelo: ", caminhao2.getModelo()));
                            caminhao2.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite a ano: ", caminhao2.getAno())));
                            caminhao2.setCapacidade(Integer.parseInt(JOptionPane.showInputDialog("Digite a capacidade: ", caminhao2.getCapacidade())));
                            caminhao2.setLargura(Integer.parseInt(JOptionPane.showInputDialog("Digite a largura: ", caminhao2.getLargura())));
                            caminhao2.setCaracteristica(JOptionPane.showInputDialog("Digite a característica: ", caminhao2.getCaracteristica()));
                            array.set(esc2, caminhao2);
                        }
                    }
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }while(esc != 0);
    }
}
