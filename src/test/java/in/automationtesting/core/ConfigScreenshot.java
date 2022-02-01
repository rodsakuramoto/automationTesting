package in.automationtesting.core;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ConfigScreenshot {
	public static byte[] takeScreenShotAsByte(WebDriver webDriver) throws IOException {
		return takeFullPageScreenShotAsByte(webDriver);
    }

    private static byte[] takeFullPageScreenShotAsByte(WebDriver webDriver) throws IOException {
    	Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2)).takeScreenshot(webDriver);
        BufferedImage originalImage = fpScreenshot.getImage();

        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
    	    ImageIO.write(originalImage, "png", baos);
    	    baos.flush();
    	    return baos.toByteArray();
    	}
    }	
}
