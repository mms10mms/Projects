// Michael Slaughter


import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        // Create the two arraylists
        ArrayList<String> tools = new ArrayList<String>();
        ArrayList<Integer> ports = new ArrayList<Integer>();

        // Add 4 items to each list
        tools.add("Wireshark");
        tools.add("Nmap");
        tools.add("Metasploit");
        tools.add("Burp Suite");
//These ports do not reflect the tools at all btw / just using them for fun I LOVE CYBER
        ports.add(22);
        ports.add(80);
        ports.add(443);
        ports.add(8080);

        // Display string list using enhanced loop
        System.out.println("Security Tools List:");
        for (String tool : tools) {
            System.out.println("- " + tool);
        }
        System.out.println();

        // Display integer list using basic loop
        System.out.println("Target Ports List:");
        for (int i = 0; i < ports.size(); i++) {
            System.out.println("Port " + (i + 1) + ": " + ports.get(i));
        }
        System.out.println();

        System.out.println("--- Running Additional Operations ---");

        // Extra operation 1: update an item
        System.out.println("Modifying tool at index 2...");
        tools.set(2, "Hydra");

        // Extra operation 2: remove an item
        System.out.println("Removing port at index 1...");
        ports.remove(1);
        System.out.println();

        // Print final lists using forEach method
        System.out.println("Updated Security Tools:");
        tools.forEach(tool -> System.out.println("-> " + tool));
        System.out.println();

        System.out.println("Updated Target Ports:");
        ports.forEach(port -> System.out.println("-> " + port));
    }
}

