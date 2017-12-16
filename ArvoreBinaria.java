public class ArvoreBinaria{

    public static void main(String[]args){
     
        new ArvoreBinaria().buildingTree();
       
    }

   static class No {
    No left;
    No right;
    int value;

    public No (int value){
      this.value = value;
    }

   }

    public void buildingTree() {
     
        No root = new No(45);

        insertNode(root, 20);
        insertNode(root, 21);
        insertNode(root, 18);
        insertNode(root, 50);
        insertNode(root, 51);
        
        System.out.println("----- Nó Principal -----");
        No node = root;
        sumNodes(node, node.value,0, "Principal");
        System.out.println();
        
        System.out.println("----- Nó Esquerdo subsequente ao principal -----");
        No nodeLeft = root.left;
        sumNodes(nodeLeft, nodeLeft.value,0, "Esquerdo");
        System.out.println();
        
        System.out.println("----- Nó Direito subsequente ao principal -----");
        No nodeRight = root.right;
        sumNodes(nodeRight, nodeRight.value,0, "Esquerdo");


    } 

    public void insertNode(No node, int value){

        if (value < node.value){
     
           if (node.left != null){
       	       insertNode(node.left, value);

            } else {
               node.left = new No(value);
            }
       
        } else if (value > node.value){

     	    if (node.right != null){
     		    insertNode(node.right, value);
     	    }else{
     		    node.right = new No(value);
     	    }
        }

        
    }



    public void sumNodes(No node, int value, int soma, String noPosition) {
            
        if (node.left != null) {
            System.out.println("Nó "+ noPosition + " " + node.value);
            System.out.println("Nó Esquerdo "+ node.left.value);
            soma = soma + node.left.value;  
            System.out.println("soma "+ soma);
            sumNodes(node.left, value, soma, noPosition);
        }
        
        if (node.right != null) {
            System.out.println("Nó "+ noPosition + " " + node.value);
            System.out.println("Nó direito "+ node.right.value);
            soma = soma + node.right.value;  
            System.out.println("soma "+ soma);
            sumNodes(node.right, value, soma, noPosition);
        }
     

    }

 }