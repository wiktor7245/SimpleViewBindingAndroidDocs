# Simple View Binding

https://developer.android.com/topic/libraries/view-binding

Add this in module level build.gradle:

```
android {
    ...
    buildFeatures {
        viewBinding true
    }
}
```

## Naming

When we have layout with the name of result_profile.xml, the generated binding class will be:
ResultProfileBinding

We can get to the parent of element by the method getRoot().

## Usage in activities

````
private lateinit var binding: ResultProfileBinding

override fun onCreate(savedInstanceState: Bundle?) {
super.onCreate(savedInstanceState)
binding = ResultProfileBinding.inflate(layoutInflater)
val view = binding.root
setContentView(view)
}```

And then:
````

binding.name.text = viewModel.name
binding.button.setOnClickListener { viewModel.userClicked() }

```
## Usage in fragments
```

private var \_binding: ResultProfileBinding? = null
// This property is only valid between onCreateView and
// onDestroyView.
private val binding get() = \_binding!!

override fun onCreateView(
inflater: LayoutInflater,
container: ViewGroup?,
savedInstanceState: Bundle?
): View? {
\_binding = ResultProfileBinding.inflate(inflater, container, false)
val view = binding.root
return view
}

override fun onDestroyView() {
super.onDestroyView()
\_binding = null
}

```
and then:
binding.name.text = viewModel.name
binding.button.setOnClickListener { viewModel.userClicked() }
```
