(ns app.components.trusted-comp)

(def comp-logo [{:src "/pictures/main/1.PNG"}
                {:src "/pictures/companies/company-2.png"}
                {:src "/pictures/companies/company-3.png"}
                {:src "/pictures/companies/company-4.png"}
                {:src "/pictures/companies/company-5.png"}])

(defn trusted-comp []
  [:div.container
   [:h3.text-center "Trusted by companies like"]
   (for [logo comp-logo]
     [:img {:src logo}])])
