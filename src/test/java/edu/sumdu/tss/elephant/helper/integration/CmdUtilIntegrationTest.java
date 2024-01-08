package edu.sumdu.tss.elephant.helper.integration;

import edu.sumdu.tss.elephant.helper.exception.BackupException;
import edu.sumdu.tss.elephant.helper.utils.CmdUtil;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CmdUtilIntegrationTest {

    @Test
    void testCmdUtilIntegration() {
        // Assuming you have a specific command that may cause an exception
        String command = "invalid-command";

        // Check if executing the command leads to a BackupException
        BackupException exception = assertThrows(BackupException.class, () -> {
            CmdUtil.exec(command);
        });

        // You can further assert details about the exception if needed
        assertNotNull(exception.getMessage());
    }
}
