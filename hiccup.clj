;conversion for clojure, requires hiccup.core to generate the html
(def path-menu
  (html
    [:div
      [:input#menu.menuControl
        {:type "checkbox" :checked "checked"}]
      [:label {:for "menu"}
        [:div.circle-container
          [:button.circle "&#10006;"]]]
      [:ul.items
        [:li "&#9733;"]
        [:li "&#9733;"]
        [:li "&#9733;"]
        [:li "&#9733;"]
        [:li "&#9733;"]
        [:li "&#9733;"]]]))
