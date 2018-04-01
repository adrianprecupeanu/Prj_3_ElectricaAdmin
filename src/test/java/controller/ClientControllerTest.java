package controller;

import junit.framework.TestCase;
import model.Client;
import model.Issue;

/**
 * Created by Adrian on 01.04.2018.
 */
public class ClientControllerTest extends TestCase {
    public void testAddClient() throws Exception {
//        assertTrue(true);

        System.out.println("\nT E S T   >>  Add New Product\n");

        ClientController con = new ClientController();
        assertEquals(0, con.dataManager().Clients.size());
        Client client = new Client("L", "l1", "12");

        System.out.println(client.Name.equals("L"));
        assert (client.Name.equals("L"));
        System.out.println(client.Address.equals("l1"));
        assert (client.Address.equals("l1"));
        System.out.println(client.idClient.equals("12"));
        assert (client.idClient.equals("12"));
		con.AddClient(client.Name, client.Address, client.idClient);
		assertEquals(1, con.dataManager().Clients.size());
		System.out.println(client.toString());
    }

    public void testAddClientIndex() throws Exception {

        System.out.println("\nT E S T   >>  Add New Issue\n");

        ClientController con = new ClientController();
        assertEquals(0, con.dataManager().Issues.size());
        Issue issue = new Issue("5", 2018, 8, 400, 200);

        System.out.println(issue.Client.equals("5"));
        assert (issue.Client.equals("5"));
        System.out.println(issue.Year == 2018);
        assert (issue.Year == 2018);
        System.out.println(issue.Month == 8);
        assert (issue.Month == 8);
        System.out.println(issue.ToPay == 400);
        assert (issue.ToPay == 400);
        System.out.println(issue.Paid == 200);
        assert (issue.Paid == 200);
        con.AddClientIndex(issue.Client, issue.Year, issue.Month, issue.ToPay);
        assertEquals(1, con.dataManager().Issues.size());
        System.out.println(issue.toString());
    }
}