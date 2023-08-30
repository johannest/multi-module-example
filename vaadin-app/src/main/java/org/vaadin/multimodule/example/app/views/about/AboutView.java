package org.vaadin.multimodule.example.app.views.about;

import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.notification.Notification;
import org.example.ColorPicker;
import org.vaadin.multimodule.example.app.views.MainLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.util.Arrays;

@PageTitle("About")
@Route(value = "about", layout = MainLayout.class)
@JsModule("color-picker.ts")
public class AboutView extends VerticalLayout {

    public AboutView() {
        setSpacing(false);

        Image img = new Image("images/empty-plant.png", "placeholder plant");
        img.setWidth("200px");
        add(img);

        add(new H2("This place intentionally left empty"));
        add(new Paragraph("It’s a place where you can grow your own UI 🤗"));

        setSizeFull();
        setJustifyContentMode(JustifyContentMode.CENTER);
        setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        getStyle().set("text-align", "center");


        H1 div = new H1("Test");
        div.getElement().getStyle().set("color", "var(--my-custom-variable)");
        add(div);

        ColorPicker colorPicker = new ColorPicker();
        colorPicker.setLabel("Color");
        colorPicker
                .setPresets(Arrays.asList(new ColorPicker.ColorPreset("#00ff00", "Color 1"),
                        new ColorPicker.ColorPreset("#ff0000", "Color 2")));

        colorPicker.addValueChangeListener(event -> {
            Notification.show(event.getValue());
        });
        add(colorPicker);

    }

}
