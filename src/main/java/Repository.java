/**
 * The repository stores information about contracts
 */
public class Repository {
    private Contract[] arr;
    private int counter;

    /**
     * The constructor creates an empty extensible repository
     */
    public Repository() {
        counter = 0;
        arr = new Contract[10];
    }

    /**
     * The function adds a contract to the repository
     * @param contract Added contract
     */
    public void addContract(Contract contract){
        if (counter == arr.length) {
            this.arr = Extend();
        }
        arr[counter] = contract;
        counter++;
    }

    /**
     * The method increases the repository capacity by 10 units
     * @return new extended repository
     */
    private Contract[] Extend(){
        Contract[] temp = new Contract[this.arr.length + 10];
        for (int i = 0; i < this.arr.length; i++)
            temp[i] = arr[i];
        return temp;
    }

    /**
     * Get information about the contract with the specified ID
     * @param id Contract ID
     * @return Returns a string with information about the contract
     */
    public String getContract(int id) {
        for (int i = 0; i < counter; i++){
            if (arr[i].getID() == id) {
                if (arr[i] instanceof Internet_contract)
                {
                    return ((Internet_contract)arr[i]).toString();
                }
                else if (arr[i] instanceof TV_contract)
                {
                    return ((TV_contract)arr[i]).toString();
                }
                else if (arr[i] instanceof Mobile_contract)
                {
                    return ((Mobile_contract)arr[i]).toString();
                }
                break;
            }
        }
        return "There is no such contract!";
    }

    /**
     * Removes the contract with the specified ID from the repository
     * @param id Contract ID
     */
    public void deleteContract(int id) {
        for (int i = 0; i < counter; i++) {
            if (arr[i].getID() == id) {
                for (int j = i; j < counter - 1; j++)
                    arr[j] = arr[j + 1];
                arr[counter - 1] = null;
                counter--;
                break;
            }
        }
    }

    /**
     * Find out the number of contracts in the repository
     * @return Repository length
     */
    public int getLength(){
        return counter;
    }
}